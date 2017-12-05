package sentence;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Stores and generates a sentence based on rules passed in.
 */
public class Generator
{
    private Map<String, ArrayList<String>> generatorRules = new HashMap<>();

    private ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * @param rules A list of rules predefined
     */
    public Generator(List<String> rules)
    {
        // check for empty list
        if (rules.size() == 0)
        {
        	throw new IllegalArgumentException("List is empty");
        }

        // loop through list
        rules.forEach(s->{
            // get rule from the line
            String rule = s.substring(0, s.indexOf('>') + 1);
            
            // check if the rule is already defined
            if (generatorRules.containsKey(rule))
            {
                throw new IllegalArgumentException("Duplicate rule found");
            }
            
            // create the rule in the map
            generatorRules.put(rule, new ArrayList<>());
            
            // remove the symbol from the line
            String data = s.replace(rule + "::=", "");
            
            // add options from the list to the rule in the map
            List<String> options = Arrays.asList(data.split("[|]"));
            generatorRules.get(rule).addAll(options);
        });
    }


    /**
     * @param symbol string to search for
     * @return true if the rules contains the symbol
     */
    public boolean contains(String symbol)
    {
        if (symbol == null || symbol.length() == 0)
        {
        	throw new IllegalArgumentException("Invalid input");
        }

        return generatorRules.containsKey(symbol);
    }

    /**
     * @return a list of symbols in the rules
     */
    public Set<String> getSymbols()
    {
        return generatorRules.keySet();
    }

    /**
     * @param symbol the <**> string pattern to generate
     * @return the string with the symbols removed or recursive to remove more
     */
    public String generate(String symbol)
    {
        // check for invalid symbols
        if (symbol == null || symbol.length() == 0)
        {
        	throw new IllegalArgumentException("Invalid input");
        }
        
        // check if there are any symbols
        if (!symbol.contains("<"))
        {
        	return symbol;
        }

        String[] results = new String[1];

        // loop through all the rules to find those that are in the symbol
        getSymbols().stream().filter(symbol::contains).forEach(s ->{
        	// store current rules options
        	List<String> rule = generatorRules.get(s);
            // replace the rule with a random option
            results[0] = symbol.replace(s, rule.get(random.nextInt(0, rule.size())));
        });

        return generate(results[0]);
    }
}