import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenerationNumbers {
	//attributes
	Integer quantity;
	
	//constructor
	public GenerationNumbers(Integer quantity) {
		this.quantity = quantity;
	}

	//methods
	public void generation(){
		List<Integer> arrayRandom = new ArrayList<>();
		int i = 0, random;

		while(i < quantity){
			int aux = 0;
			random = (int) (Math.random() * 60) + 1;
			
			for(int listArrayRandom : arrayRandom){
				if(random == listArrayRandom){
					aux = 1;
					break;
				}
			}
			if(aux == 1) continue;
			arrayRandom.add(random);
			i++;
		}

		Collections.sort(arrayRandom);
		
		for(int print : arrayRandom)
			System.out.println(print);
	}
}
