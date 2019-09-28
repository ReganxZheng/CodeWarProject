package codewar;

public class codeWarRanking {
	
		public int rank, progress;
		public codeWarRanking() {
			this.rank = -8;
			this.progress = 0;
		}
		
		public void incProgress(int level) {
			if(this.rank == 8) {
					this.progress = 0;
			}
			else if(level <= 8 && level >= -8 && level != 0) {
					if(level == this.rank) {
						this.progress+=3;
						upgrade();
					}
					else if(this.rank < 0) {
						int diff = level < 0 ? this.rank - level : this.rank -(level -1);
						if(diff==1) {
							this.progress++;
						}
						else if(diff>=2) {
							
						}
						else if(diff<=-1) {
							this.progress+=diff*diff*10;
						}
						upgrade();
					}
					else if(this.rank > 0) {
						int diff = level < 0 ? this.rank - (level + 1) : this.rank - level;
						if(diff==1) {
							this.progress++;
						}
						else if(diff>1) {
							
						}
						else if(diff<0) {
							this.progress+=diff*diff*10;
						}
						upgrade();
					}
			}
			else throw new java.lang.IllegalArgumentException();
		}
		
		public void upgrade() {
			if(this.progress >= 100) {
				int rankUp = this.progress / 100;
				this.progress = this.progress % 100;
				if(this.rank<0 && this.rank+rankUp >= 0) {
					if(this.rank == 8) {
						this.rank = 8;
						this.progress = 0;
					}
					else {
						this.rank = this.rank+rankUp+1;
						if(this.rank == 8) {
							this.progress =0;
						}
					}
				}
				else {
					if(this.rank == 8) {
						this.rank = 8;
						this.progress = 0;
					}
					else {
						this.rank+=rankUp;
						if(this.rank == 8) {
							this.progress =0;
						}
					}
				}
			}
		}
	
	public static void main(String[] args) {
		codeWarRanking user = new codeWarRanking();
		user.incProgress(2);
		System.out.println(user.rank);
		System.out.println(user.progress);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		user.incProgress(8);
		System.out.println(user.rank);
		System.out.println(user.progress);
	}
}
