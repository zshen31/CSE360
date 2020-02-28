package cse360assign2;

public class SimpleList {
	int count;
	int[] list;

	public SimpleList(){
		this.count = 0;
		this.list = new int[10];
	}
	private void resize(int newS){
		int array[] = new int[newS];
		for(int i = 0; i < newS && i < count; i++){
			array[i] = list[i];
		}
		list = array;
		if(newS < count){
			count = newS;
		}
	}
//If the list was full,then increase the size by 50%
	public void add(int parameter){
		int n = list.length;
		if(count == list.length){
			int half = count/2;
			resize(count + half);
		}
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
		int l = list.length;

		int index = -1;
		for(int i = 0; i < l; i++){
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
	//If the list has more than 25% empty places, the decrease the size of the list
	public void remove(int parameter){
		int index = search(parameter);
		if(index != -1){
			for(int i = index; i < count - 1; i++){
				list[i] = list[i + 1];
			}
			count --;
		}
		else
		{System.out.println("removed failed.");}
		//If the list has more than 25% empty places, the decrease the size of the list.
		int k = (list.length)*3/4;
		if(count < k){
			resize(count);
		}
	}
  //f the list was full, then increase the size by 50% so there will be room. Increment the count.
	public void append(int n){
		if(count == list.length){
			int half = count/2;
			resize(count + half);
		}
		list[count] = n;
		count ++;
	}
	//Return the first element in the list
	public int first(){
		if(count == 0){
			throw new RuntimeException("list is empty!");
		}
		else
			return list[0];
	}
	//Return the current number of possible locations in the list
	public int size(){
		return list.length;
	}
}
