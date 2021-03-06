public final strictfp class OddsAndEnds {
	
	static private void test(float f, Object o){
	    //synchronized(o)
		{
			long x = (long)f;	
			if (o instanceof Long) {
				long y = (Long)o;
				
				if (y <= x){
					System.out.println((-y) % (-f));
				}
			}			
		}
	}

    public static void main(String args[]){
        test(42.24f, args);	
		test(4.224f, Long.valueOf(args[0]));	
		
		test(-0.0f, main(999999999L));	        
    }

 	public static int main(Object x){
		boolean a = false;
		boolean b = true;
		boolean c = x == null == a;
		boolean d = b?a?b:a?b:a:b?a:b;	
		boolean e = (a?b:c)?d:c?b:a;	
			
		return ((Number) x).shortValue();
	}
}