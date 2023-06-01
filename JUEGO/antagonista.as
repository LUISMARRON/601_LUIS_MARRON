package  {
	import flash.display.MovieClip;
	import flash.events.Event;
	
	public class antagonista extends MovieClip{
		
		private var vel: int=10;
		private var dir: Number=1;
		private var limite_der: int=520;
		private var limite_izq: int=23;
		
		

		public function antagonista() {
			// constructor code
			addEventListener(Event.ENTER_FRAME, actualiza);
		}
		
		public function actualiza(e: Event){
			x+= vel * dir;
			if( x >= limite_der){
				dir = -1;
			}
			if( x<= limite_izq){
				dir = 1;
			}
		}

	}
	
}
