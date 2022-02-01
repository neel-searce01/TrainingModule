class Link{
	int idata = -1;
	String sdata = null;
	Link next;

	public Link(int idata){
		this.idata = idata;
	}

	public Link(String sdata){
		this.sdata = sdata;
	}

	public int getIntKey(){
		return idata;
	}

	public String getStrKey(){
		return sdata;
	}
}

class SortedList{
	Link head;

	public SortedList(){
		head = null;
	}

	public void insert(Link node){
		int key = node.getIntKey();
		Link previous = null;
		Link current = head;

			if(key != -1){
				while(current != null && key > current.getIntKey()){
					previous = current;
					current = current.next;
				}
			}
			else{
				String skey = node.getStrKey();
				while(current != null && skey.equals(current.getStrKey()){
					previous = current;
					current = current.next;
				}
			}

			if(previous == null)
				head = node;
			else
				previous.next = node;
			node.next = current;
		}

	public void delete(int key){
		if(head == null){
			System.out.prinln("Empty");
			return;
		}
		if(key == head.getIntKey()){
			head = null;
			return;
		}

		Link previous = head;
		Link current = head.next;

		while(current != null && key != current.getIntKey()){
			previous = current;
			current = current.next;
		}

		if(current == null)
			System.out.println("Doesn't exist");
		else
			previous.next = current.next;
	}

	public void delete(String key){
		if(head == null){
			System.out.prinln("Empty");
			return;
		}
		if(key == head.getStrKey()){
			head = null;
			return;
		}

		Link previous = head;
		Link current = head.next;

		while(current != null && !key.equals(current.getStrKey())){
			previous = current;
			current = current.next;
		}

		if(current == null)
			System.out.println("Doesn't exist");
		else
			previous.next = current.next;
	}

	public Link find(int key){
		if(key == head.getIntKey()){
			return head;
		}
		Link current = head;

		while(current != null && key != current.getIntKey()){
			current = current.next;
		}

		if(current == null)
			return null;
		else
			return current;
	}

	public Link find(String key){
		if(key == head.getStrKey()){
			return head;
		}
		Link current = head;

		while(current != null && !key.equals(current.getStrKey())){
			current = current.next;
		}

		if(current == null)
			return null;
		else
			return current;
	}

	public void displayList(){
		Link current = head;

		while(current != null){
			if(current.getIntKey == -1)
				System.out.print(current.getStrKey());
			else
				System.out.print(current.getIntKey());
			current = current.next;
		}
	}
}

class HashTable{
	SortedList[] array;
	int arraySize;

	public HashTable(int arraySize){
		this.arraySize = arraySize;
		array = new SortedList[arraySize];

		for(int j = 0; j<arraySize; j++){
			array[j] = new SortedList();
		}
	}

	public int HashFunc(int key){
		return key % arraySize;
	}

	public int HashFunc(String key){
		return key.length() % arraySize;
	}

	public void insert(Link link){
		int key = link.getIntKey();
		int hashVal;
		if(key == -1)
			hashVal = HashFunc(link.getStrKey());
		else
			hashVal = HashFunc(key);

		array[hashVal].insert(link);
	}

	public void delete(int key){
		int hashVal = HashFunc(key);
		array[hashVal].delete(key);
	}

	public void delete(String key){
		int hashVal = HashFunc(key);
		array[hashVal].delete(key);
	}

	public Link find(int key){
		int hashVal = HashFunc(key);
		Link store = array[hashVal].find(key);
		return store;
	}

	public Link find(String key){
		int hashVal = HashFunc(key);
		Link store = array[hashVal].find(key);
		return store;
	}
}