package advent2;

public class Advent2 
{
	public static void main(String[] args)
	{
		String line1 = "1236	741	557	1029	144	101	1968	2159	1399	80	1139	1167	1695	82	90	2236";
		String line2 = "2134	106	107	1025	584	619	191	496	80	352	351	2267	1983	1973	97	1244";
		String line3 = "3227	179	691	3177	172	1636	3781	2020	3339	2337	189	3516	1500	176	159	3279";
		String line4 = "201	688	364	180	586	659	623	577	188	265	403	670	195	720	115	37";
		String line5 = "1892	1664	2737	2676	849	2514	923	171	311	218	255	2787	1271	188	1278	2834";
		String line6 = "150	3276	204	603	3130	587	3363	3306	2890	127	176	174	383	3309	213	1620";
		String line7 = "5903	3686	200	230	6040	4675	6266	179	5375	1069	283	82	6210	6626	6398	1954";
		String line8 = "942	2324	1901	213	125	2518	655	189	2499	160	2841	2646	198	173	1841	200";
		String line9 = "232	45	272	280	44	248	50	266	296	297	236	254	58	212	276	48";
		String line10 = "563	768	124	267	153	622	199	591	204	125	93	656	198	164	797	506";
		String line11 = "243	4746	1785	204	568	4228	2701	4303	188	4148	4831	1557	4692	166	4210	3656";
		String line12 = "72	514	1572	172	1197	750	1392	1647	1587	183	1484	213	1614	718	177	622";
		String line13 = "1117	97	2758	2484	941	1854	1074	264	2494	83	1434	96	2067	2825	2160	92";
		String line14 = "2610	1290	204	2265	1374	2581	185	852	207	175	3308	1500	2898	1120	1892	3074";
		String line15 = "2322	1434	301	2156	98	2194	587	1416	1521	94	1985	424	91	119	1869	1073";
		String line16 = "66	87	176	107	2791	109	21	92	3016	2239	1708	3175	3210	2842	446	484";
		
		String[] split1 = line1.split("\\s+");
		String[] split2 = line2.split("\\s+");
		String[] split3 = line3.split("\\s+");
		String[] split4 = line4.split("\\s+");
		String[] split5 = line5.split("\\s+");
		String[] split6 = line6.split("\\s+");
		String[] split7 = line7.split("\\s+");
		String[] split8 = line8.split("\\s+");
		String[] split9 = line9.split("\\s+");
		String[] split10 = line10.split("\\s+");
		String[] split11 = line11.split("\\s+");
		String[] split12 = line12.split("\\s+");
		String[] split13 = line13.split("\\s+");
		String[] split14 = line14.split("\\s+");
		String[] split15 = line15.split("\\s+");
		String[] split16 = line16.split("\\s+");
		
		int checksum1 = checker1(split1) + checker1(split2) + checker1(split3) + checker1(split4) + checker1(split5) + checker1(split6) + checker1(split7) +
				 checker1(split8) + checker1(split9) + checker1(split10) + checker1(split11) + checker1(split12) + checker1(split13) + checker1(split14) +
				 checker1(split15) + checker1(split16);
		System.out.println(checksum1);
		
		int checksum2 = checker2(split1) + checker2(split2) + checker2(split3) + checker2(split4) + checker2(split5) + checker2(split6) + checker2(split7) +
				 checker2(split8) + checker2(split9) + checker2(split10) + checker2(split11) + checker2(split12) + checker2(split13) + checker2(split14) +
				 checker2(split15) + checker2(split16);
		System.out.println(checksum2);	
		
	}
	public static int checker1(String[] array)
	{
		int big = Integer.parseInt(array[0]);
		int small = Integer.parseInt(array[0]);
		
		for (int i = 0; i < array.length; i++)
		{
			if (Integer.parseInt(array[i]) > big)
			{
				big = Integer.parseInt(array[i]);
			}
			if (Integer.parseInt(array[i]) < small)
			{
				small = Integer.parseInt(array[i]);
			}
		}
		
		return big - small;
	}
	
	public static int checker2(String[] array)
	{
		int answer = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array.length; j++)
			{
				if (Integer.parseInt(array[i]) > Integer.parseInt(array[j]) && Integer.parseInt(array[i]) % Integer.parseInt(array[j]) == 0 )
				{
					answer = Integer.parseInt(array[i]) / Integer.parseInt(array[j]);
				}
			}
			
		}		
		return answer;
	}
}