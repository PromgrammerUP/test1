package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String className = "reflect.Person";
		
			Class clazz = Class.forName(className);
		//	Object obj = clazz.newInstance();
			Constructor[] cons = clazz.getDeclaredConstructors();
			System.out.println("构造方法的数量:"+cons.length);
			
//			for(Constructor con:cons){
//				Class[] params = con.getParameterTypes();
//				System.out.println("构造方法的参数个数是："+params.length);
//				if(params.length==0){
//					con.setAccessible(true);
//					con.newInstance();
//					con.setAccessible(false);
//				}else{
//				  Object[] p = new Object[]{"1102110","张三丰",58};
//				  con.newInstance(p);
//				  for(Class param:params){
//					  System.out.println(param.getName());
//				  }
//				}
//				System.out.println("----------------------");
//			}
			Constructor con = clazz.getDeclaredConstructor();
			con.setAccessible(true);
			Object obj = con.newInstance();
			con.setAccessible(false);
//			
//			Class[] parameterTypes = new Class[]{java.lang.String.class,java.lang.String.class,int.class};
//			Constructor con1 = clazz.getDeclaredConstructor(parameterTypes);
//			Object[] initargs = new Object[]{"11110000","张三丰",58};
//			con1.newInstance(initargs);
//			Field[] fields = clazz.getDeclaredFields();
//			for(Field field: fields){
//				System.out.println(field.getName());
//				System.out.println(field.getType());
//				field.setAccessible(true);
//				//取得obj的属性
//				System.out.println(field.get(obj));
//				field.setAccessible(false);
//				System.out.println("------------------------");
//			}
//			Field field = clazz.getDeclaredField("name");
//			field.setAccessible(true);
//			field.set(obj, "李白");
//			Object value = field.get(obj);
//			field.setAccessible(false);
//			System.out.println(value);
			Class[] pramas = new Class[]{java.lang.String.class};
			Method method = clazz.getDeclaredMethod("setName", pramas);
			Object[] pars = new Object[]{"李大钊"};
			method.invoke(obj, pars);
			
			Method me = clazz.getDeclaredMethod("getName");
			Object value = me.invoke(obj);
			System.out.println(value);
			
		} 

}
