import java.util.ArrayList;
import java.util.Scanner;

public class fightinggameprocess
	{
		
		
		static int computerFighterChoice= (int)(Math.random()*3)+0;
		static int computerDamage=0;
		static int userChooseFighter=0;
		static String computerActionChoice;
		
		public static void main(String[] args)
			{
				fighterInformation.fillFighterInformation();
				fighterintroduce();
				playerchoosing();
				

			}
		

		private static void fighterintroduce()
			{
				System.out.println("Welcome to the fighting game, choose your fighter!!!");
				System.out.println("Which fighter do you want to choose?");
				System.out.println("1) "+fighterInformation.fightInformation.get(0).getFighterName());
				System.out.println("2) "+fighterInformation.fightInformation.get(1).getFighterName());
				System.out.println("3) "+fighterInformation.fightInformation.get(2).getFighterName());
				System.out.println("4) " + fighterInformation.fightInformation.get(3).getFighterName());
				System.out.println("5) " + fighterInformation.fightInformation.get(4).getFighterName());
				Scanner userinput = new Scanner(System.in);
				int userPick = userinput.nextInt();
				userChooseFighter=userPick - 1;
				
				
				System.out.println("You have selected "+fighterInformation.fightInformation.get(userChooseFighter).getFighterName() + ".");
				System.out.println("Your opponent is "+fighterInformation.fightInformation.get(computerFighterChoice).getFighterName() + ".");
				System.out.println("Let's Fight!!!");
				
			}
		static void playerchoosing()
			{
				int computerHp=fighterInformation.fightInformation.get(computerFighterChoice).getHp();
				int playerHp=fighterInformation.fightInformation.get(userChooseFighter).getHp();
				boolean result = true;
				while(result)
					{
						int reflectPoints= (int)(Math.random()*3)+1;
						int fightingselfdamage=(int)(Math.random()*2)+1;
						int computerActions= (int)(Math.random()*2)+1;
						switch(computerActions)
						{
							case 1:
									{
										computerDamage=fighterInformation.fightInformation.get(computerFighterChoice).getAttack();
										break;
									}
							case 2:
								
									{
										computerDamage=fighterInformation.fightInformation.get(computerFighterChoice).getDefence();
										break;
									}
						}
						
						Scanner userinput1 = new Scanner(System.in);
						System.out.println("Do you want to fight, defend, or use magic?");
						System.out.println("(1) fight  (2) defend (3) magic");
						int userChooseAction = userinput1.nextInt();
						
						
						if(userChooseAction==1)
							{
								if(computerActions==1)
									{
										System.out.println("Computer chose to fight and deals "+computerDamage+" points");
										System.out.println("You chose to fight and deal "+fighterInformation.fightInformation.get(userChooseFighter).getAttack()+" points");
										
										if(fighterInformation.fightInformation.get(userChooseFighter).getAttack()>computerDamage)
											{
												System.out.println("Computer HP loses "+(fighterInformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " points.");
												computerHp=computerHp-fighterInformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer HP has "+computerHp+" points left.");
												playerHp=playerHp-fightingselfdamage;
												System.out.println("Since Computer's attack damage is lower or equal to your attack damage, the computer randomly does "+fightingselfdamage+" damage to you too.");
												System.out.println("You have "+playerHp+" HP left.");
								
											}
										else
											{
												System.out.println("Your HP drops "+(computerDamage-fighterInformation.fightInformation.get(userChooseFighter).getAttack()) + " points");
												playerHp=playerHp+fighterInformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage;
												System.out.println("Your HP is "+playerHp+".");
												System.out.println("Since your attack damage is lower or equal to the computer attack damage, you do "+fightingselfdamage+" damage to the computer.");
												computerHp=computerHp-fightingselfdamage;
												System.out.println("Computer has "+computerHp+" HP left.");
												
											}
										
									}
								else
									{
										System.out.println("You chose to fight and deal "+fighterInformation.fightInformation.get(userChooseFighter).getAttack()+" damage.");
										System.out.println("Computer chose to defend and blocked "+computerDamage+" damage.");
										if(fighterInformation.fightInformation.get(userChooseFighter).getAttack()>computerDamage)
											{
												System.out.println("Computer Hp drops "+(fighterInformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " point");
												computerHp=computerHp-fighterInformation.fightInformation.get(userChooseFighter).getAttack()+computerDamage;
												System.out.println("Computer HP is "+computerHp+".");
												
											}
										else
											{
												System.out.println("Since your attack damage is lower or even with the computer's defence, it returns "+reflectPoints+" damage to you.");
												playerHp=playerHp-reflectPoints;
												System.out.println("Your HP is "+playerHp+".");
											}
										
									}
								
							}
						else
							{
								if(computerActions==1)
									{
										System.out.println("You chose to defend and stopped "+fighterInformation.fightInformation.get(userChooseFighter).getDefence()+" points of damage.");
										System.out.println("Computer chose to fight and dealt "+computerDamage+" points of damage.");
										if(fighterInformation.fightInformation.get(userChooseFighter).getDefence()>computerDamage)
											{
												computerHp=computerHp-reflectPoints;
												System.out.println("Since your defence damage is higher or even with the computer's attack, you return "+reflectPoints+" points od damage to the computer.");
												System.out.println("Computer HP is "+computerHp+".");
												
												
											}
										else
											{
												playerHp=playerHp+fighterInformation.fightInformation.get(userChooseFighter).getDefence()-computerDamage;
												System.out.println("Your HP drops "+(fighterInformation.fightInformation.get(userChooseFighter).getAttack()-computerDamage) + " points.");
												System.out.println("Your HP is "+playerHp+".");
											}
									
									}
								else
									{
										System.out.println("Both of you chose to defend so no damage to any one.");
									}
							}
						if(computerHp<1)
							{
								System.out.println("You win the game!!!");
								result=false;
								break;
							}
						else if(playerHp<1)
						{
							System.out.println("You just lost the game!!!");
							result=false;
							break;
						}
					}
				
				
			}
		

	}
