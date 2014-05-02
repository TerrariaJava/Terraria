package com.josalaito.terraria;

import com.josalaito.terraria.Item;
import java.lang.Object;

public class Chest implements Cloneable {
	public static final String Empty = "";
	public int MaxNameLength = 20;
	public static int deferredChestID;
	public static Chest deferredChest;
	public static int maxChestTypes = 31;
	public static int[] typeToIcon = new int[Chest.maxChestTypes];
	public static int[] itemSpawn = new int[Chest.maxChestTypes];
	public static int maxItems = 40;
	public Item[] item;
	public int x;
	public int y;
	public boolean bankChest;
	public String name;
	public Chest(boolean bank)
	{
		bank = false;
		this.item = new Item[Chest.maxItems];
		this.bankChest = bank;
		this.name = Empty;
	}
	public static void Initialize()
	{
		Chest.typeToIcon[0] = (Chest.itemSpawn[0] = 48);
		Chest.typeToIcon[1] = (Chest.itemSpawn[1] = 306);
		Chest.typeToIcon[2] = 327;
		Chest.itemSpawn[2] = 306;
		Chest.typeToIcon[3] = (Chest.itemSpawn[3] = 328);
		Chest.typeToIcon[4] = 329;
		Chest.itemSpawn[4] = 328;
		Chest.typeToIcon[5] = (Chest.itemSpawn[5] = 343);
		Chest.typeToIcon[6] = (Chest.itemSpawn[6] = 348);
		Chest.typeToIcon[7] = (Chest.itemSpawn[7] = 625);
		Chest.typeToIcon[8] = (Chest.itemSpawn[8] = 626);
		Chest.typeToIcon[9] = (Chest.itemSpawn[9] = 627);
		Chest.typeToIcon[10] = (Chest.itemSpawn[10] = 680);
		Chest.typeToIcon[11] = (Chest.itemSpawn[11] = 681);
		Chest.typeToIcon[12] = (Chest.itemSpawn[12] = 831);
		Chest.typeToIcon[13] = (Chest.itemSpawn[13] = 838);
		Chest.typeToIcon[14] = (Chest.itemSpawn[14] = 914);
		Chest.typeToIcon[15] = (Chest.itemSpawn[15] = 952);
		Chest.typeToIcon[16] = (Chest.itemSpawn[16] = 1142);
		Chest.typeToIcon[17] = (Chest.itemSpawn[17] = 1298);
		Chest.typeToIcon[18] = (Chest.itemSpawn[18] = 1528);
		Chest.typeToIcon[19] = (Chest.itemSpawn[19] = 1529);
		Chest.typeToIcon[20] = (Chest.itemSpawn[20] = 1530);
		Chest.typeToIcon[21] = (Chest.itemSpawn[21] = 1531);
		Chest.typeToIcon[22] = (Chest.itemSpawn[22] = 1532);
		Chest.typeToIcon[23] = 1533;
		Chest.itemSpawn[23] = 1528;
		Chest.typeToIcon[24] = 1534;
		Chest.itemSpawn[24] = 1529;
		Chest.typeToIcon[25] = 1535;
		Chest.itemSpawn[25] = 1530;
		Chest.typeToIcon[26] = 1536;
		Chest.itemSpawn[26] = 1531;
		Chest.typeToIcon[27] = 1537;
		Chest.itemSpawn[27] = 1532;
		Chest.typeToIcon[28] = (Chest.itemSpawn[28] = 2230);
		Chest.typeToIcon[29] = (Chest.itemSpawn[29] = 2249);
		Chest.typeToIcon[30] = (Chest.itemSpawn[30] = 2250);
	}
	
	public Object Clone(){  
	    try{  
	        return super.clone();  
	    }catch(Exception e){ 
	        return null; 
	    }
	}
	
	//TODO : IMPLEMENT MORE CODE WHEN MAIN.JAVA WILL BE FULLY IMPLEMENTED
}
