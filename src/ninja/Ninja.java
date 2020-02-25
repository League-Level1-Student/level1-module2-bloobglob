package ninja;

	public class Ninja {

		/* Assume the Enemy class exists and has the required methods. */
		String alliegence;
		Enemy enemy;
		     Ninja(Enemy enemy, String alliegence) {
		          this.alliegence = alliegence;
		          this.enemy = enemy;
		     }

		     void sabotage() {
		          infiltrate();
		          setOnFire(enemy.getLocation());
		     }


		     void infiltrate() {
		          Ninja nagato = new Ninja(new Enemy(), "Nagato");
		          Ninja momochi = new Ninja(new Enemy(), "Momochi");
		     }
		}
