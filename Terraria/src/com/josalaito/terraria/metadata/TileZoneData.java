package com.josalaito.terraria.metadata;

public class TileZoneData {
	public int quickWorld;
	public int quickPlayer;
	private boolean solid;
	private boolean hallow;
	private boolean corrupt;
	private boolean crimson;
	private boolean desert;
	private boolean snow;
	private boolean meteor;
	private boolean jungle;
	private boolean dungeon;
	
	public boolean getSolid(){
		return this.solid;
	}
	
	public void setSolid(boolean solid){
		if(this.solid != solid){
			this.solid = solid;
			this.quickWorld ^= 1;
		}
	}
		
		public boolean getHallow(){
			return this.hallow;
		}
		
		public void setHallow(boolean hallow){
			if(this.hallow != hallow){
				this.hallow = hallow;
				this.quickWorld ^= 2;
				this.quickPlayer ^= 2;
			}
	}
		
		public boolean getCorrupt(){
			return this.corrupt;
		}
		
		public void setCorrupt(boolean corrupt){
			if(this.corrupt != corrupt){
				this.corrupt = corrupt;
				this.quickWorld ^= 4;
				this.quickPlayer ^= 4;
			}
	}
		
		public boolean getCrimson(){
			return this.crimson;
		}
		
		public void setCrimson(boolean crimson){
			if(this.crimson != crimson){
				this.crimson = crimson;
				this.quickWorld ^= 8;
				this.quickPlayer ^= 8;
			}
	}
		
		public boolean getDesert(){
			return this.desert;
		}
		
		public void setDesert(boolean desert){
			if(this.desert != desert){
				this.desert = desert;
				this.quickPlayer ^= 16;
			}
	}
		
		public boolean getSnow(){
			return this.snow;
		}
		
		public void setSnow(boolean snow){
			if(this.snow != snow){
				this.snow = snow;
				this.quickPlayer ^= 32;
			}
	}
		
		public boolean getMeteor(){
			return this.meteor;
		}
		
		public void setMeteor(boolean meteor){
			if(this.meteor != meteor){
				this.meteor = meteor;
				this.quickPlayer ^= 64;
			}
	}
		
		public boolean getJungle(){
			return this.jungle;
		}
		
		public void setJungle(boolean jungle){
			if(this.jungle != jungle){
				this.jungle = jungle;
				this.quickPlayer ^= 128;
			}
	}
		
		public boolean getDungeon(){
			return this.dungeon;
		}
		
		public void setDungeon(boolean dungeon){
			if(this.dungeon != dungeon){
				this.dungeon = dungeon;
				this.quickPlayer ^= 256;
			}
	}
		
		public TileZoneData(){
			this.quickPlayer = 0;
			this.quickWorld = 0;
			this.solid = false;
			this.hallow = false;
			this.corrupt = false;
			this.crimson = false;
			this.desert = false;
			this.snow = false;
			this.meteor = false;
			this.jungle = false;
			this.dungeon = false;
		}
		
		public TileZoneData(boolean isSolid, boolean isHallow, boolean isCorrupt, boolean isCrimson, boolean isDesert, boolean isSnow, boolean isMeteor, boolean isJungle, boolean isDungeon){
			isSolid = false;
			isHallow = false;
			isCorrupt = false;
			isCrimson = false;
			isDesert = false;
			isSnow = false;
			isMeteor = false;
			isJungle = false;
			isDungeon = false;
			this.quickPlayer = 0;
			this.quickWorld = 0;
			this.setSolid(isSolid);
			this.setHallow(isHallow);
			this.setCorrupt(isCorrupt);
			this.setCrimson(isCrimson);
			this.setDesert(isDesert);
			this.setSnow(isSnow);
			this.setMeteor(isMeteor);
			this.setJungle(isJungle);
			this.setDungeon(isDungeon);
		}
	
}
