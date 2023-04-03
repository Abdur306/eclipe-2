package Arrays;

public class StrStrBufStrBul {

	public static void main(String[] args) {
		String str="Zoho";
		StringBuffer buff=new StringBuffer("Zoho");
		StringBuilder build=new StringBuilder("zoho");
		long startTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++)
			str+=" corp";
		System.out.println("string :"+(System.currentTimeMillis()-startTime));

		startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			buff.append("corporation @ estancia");
		System.out.println("stringbuff :"+(System.currentTimeMillis()-startTime));

		startTime=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			build.append("abdur working in corporation @ estancia since 3 yrs");
		System.out.println("stringbuild :"+(System.currentTimeMillis()-startTime)+"\n");

	}

}
