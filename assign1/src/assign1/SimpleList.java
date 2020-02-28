package assign1;

public class SimpleList {
	int count;
	int[] list;

	public SimpleList(){
		this.count = 0;
		this.list = new int[10];
	}

	public void add(int parameter){
		int n = list.length;
		if(n > 0){
			for(int i = n - 1; i > 0; i--){
			if(n == 10){
			list[i] = list[i - 1];
			}

			else{
				list[i + 1] = list[i];
			}
			 }
		}
		list[0] = parameter;
		if(this.count < 10)
			this.count++;
	}

	public int search(int parameter){
		int n = list.length;

		int index = -1;
		for(int i = 0; i < n; i++){
			if(list[i] == parameter){
				index = i;
			}
		}
		return index;
	}


	public int count(){
		return this.count;
	}

	public String toString(){
		String listStr = "";
		try{
			for(int i = 0; i < this.list.length; i++){
				listStr += list[i] + "";
			}
		}
		catch (Exception e){
		}
		return listStr.trim();
	}

	public void remove(int parameter){
		int n = list.length;
		int romveind = -1;
		for(int i = 0; i < n; i++){
			if(list[i] == parameter){
				romveind = i;
				this.count--;
			}
		}
		if(romveind != -1){
			for(int i = romveind; i < n-1; i++){
				list[i] = list[i+1];
			}
			list[n - 1] = 0;
		}
	}

}
