
public class fighter
	{
		private String fighter;
		private int hp;
		private int attack;
		private int defence;
		
		public fighter(String f, int h, int a, int de)
					{
						fighter = f;
						hp = h;
						attack = a;
						defence = de;
					}

		public String getFighterName()
			{
				return fighter;
			}

		public void setFighter(String fighter)
			{
				this.fighter = fighter;
			}

		public int getHp()
			{
				return hp;
			}

		public void setHp(int hp)
			{
				this.hp = hp;
			}

		public int getAttack()
			{
				return attack;
			}

		public void setAttack(int attack)
			{
				this.attack = attack;
			}

		public int getDefence()
			{
				return defence;
			}

		public void setDefence(int defence)
			{
				this.defence = defence;
			}

	}
