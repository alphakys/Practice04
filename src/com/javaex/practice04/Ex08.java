package com.javaex.practice04;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		lotto[0] = (int)((Math.random()*7)+1);
		lotto[1] = (int)((Math.random()*14)+8);
		lotto[2] = (int)((Math.random()*21)+15);
		lotto[3] = (int)((Math.random()*28)+22);
		lotto[4] = (int)((Math.random()*35)+29);
		lotto[5] = (int)((Math.random()*45)+36);
		
		System.out.println(lotto[0]);
		
		
		
	int randomLotto = lotto[(int)(Math.random()*6)];
		
	boolean run = true;
	/*
	for(int i=0;i<6;i++) {
					System.out.println(lotto[(int)(Math.random()*i)]);
					}
	
	/*
	while(run) {
		
			int count = 0;
				
				if(count6)
				System.out.println(randomLotto);
						
										
								
				}
		
		
		
		
		
		/*
		for(int k : lotto) {
			System.out.print(k+"  ");
							}
		
*/
	}

}
