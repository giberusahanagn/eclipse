package com.xworkz.constants;

public enum TeaType {
   NORMAL_TEA(1),LEMON_TEA(2),GREEN_TEA(3),GINGER_TEA(4);
	
		public int number;
		
		private TeaType(int number) {
			this.number=number;
		
		}
}
