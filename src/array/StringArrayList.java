package array;

public class StringArrayList {
    public String[] list = new String[9];
	public void add(String src){
		for(int i=0;i<list.length;i++){
			if(list[i]==null){
				list[i]=src;
				break;
			}
			if(list.length -1 == i){
				String[] temp = list;
				list = new String[list.length+9];
				System.arraycopy(temp, 0, list, 0, temp.length);
//				add(src);
//				break;
			}
		}
	}
	public int size(){
		int result = 0;
		for(int i=0;i<list.length;i++){
			if(list[i]==null){
				result = i;
				break;
			}
			if(list.length-1 == i){
				result = list.length;
			}
		}
		return result;
	}
	public String get(int i){
		if(size()<=i){
			return null;
		}
		else{
			return list[i];
		}
	}
	public void remove(int j){
		for(int i=0;i<size()-1;i++){
			if(i>=j){
				list[i] = list[i+1];
			}
		}
		list[size()-1] = null;
	}
	public void clear(){
		for(int i=0;i<size();i++){
			list[i] = null;
		}
	}
	public void update(int i,String src){
		if(i>=size()){
			return;
		}else{
			list[i] = src;
		}
		
		
	}
	public static void main(String[] args) {
		StringArrayList lis = new StringArrayList();
		lis.add("1");
		lis.add("2");
		lis.add("3");
		lis.add("4");
//		lis.add("5");
//		lis.add("6");
//		lis.add("7");
//		lis.add("8");
//		lis.add("9");
//		lis.add("10");
//		lis.add("11");
//		lis.add("12");
//		for(int i=0;i<lis.list.length;i++){
//			System.out.println(lis.list[i]);
//		}
//		System.out.println(lis.size());
//		System.out.println(lis.get(9));
		for(int i = 0;i<lis.size();i++){
			System.out.println(lis.get(i));
		}
//		lis.remove(1);
		//lis.clear();
		lis.update(2, "9");
		for(int i = 0;i<lis.size();i++){
			System.out.println(lis.get(i));
		}
	}
}
