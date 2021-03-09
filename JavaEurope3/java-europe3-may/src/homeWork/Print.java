package homeWork;

public class Print {

	private double tonerLevel=100;
	private int numPage;
	private boolean duplix;
	
	public double getTonerLevel() {
		return tonerLevel;
	}
	public void setTonerLevel(double tonerLevel) {
		this.tonerLevel = tonerLevel;
	}
	public int getNumPage() {
		return numPage;
	}
	public void setNumPage(int numPage) {
		this.numPage = numPage;
	}
	public boolean isDuplix() {
		return duplix;
	}
	public void setDuplix(boolean duplix) {
		this.duplix = duplix;
	}
	
	public Print(int numPage, boolean duplix) {
		int page = 1;
		if(duplix) {
			
			if(numPage%2==0) {
				for(int i=0; i<numPage/2; i++) {
					if(tonerLevel>0) {
						System.out.print((i+1)+": ");
						System.out.print("Printing pages:" + page + " and " + (page+1)+", ");
						System.out.println("Toner level = "+tonerLevel + "%");
						page+=2;
						tonerLevel-=2;					
				    }else {
				    	System.out.println("Insuficient toner level");
				    	break;
				    }
			}
			
		}else if(numPage%2>0) {
			for(int i=0; i< (numPage/2)+1; i++) {
				if(tonerLevel>0) {
					System.out.print((i+1)+": ");
					System.out.print("Printing pages:" + page + " and " + (page+1)+", ");
					System.out.println("Toner level = "+tonerLevel + "%");
					page+=2;
					tonerLevel-=2;					
			    }else {
			    	System.out.println("Insuficient toner level");
			    	break;
			    }
			}
		}
		}else {
			for(int i=0; i< numPage; i++) {
				if(tonerLevel>0) {
					System.out.print((i+1)+": ");
					System.out.print("Printing page:" + page + ", ");
					System.out.println("Toner level = "+tonerLevel + "%");
					page++;
					tonerLevel--;					
			    }else {
			    	System.out.println("Insuficient toner level");
			    	break;
			    }
			}
		}
		
	}
	
}
