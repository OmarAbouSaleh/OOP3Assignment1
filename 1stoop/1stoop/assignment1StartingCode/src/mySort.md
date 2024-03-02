## Shell Sort Method

## Shell sort is an in-place comparison sort that geneeralizes the insertion sort to allow the exchange of items that are far apart. It rearranges the list of elements so that, starting anywhere, taking every n'th element produces a sorted list. 
## It starts by comparing lements that are a far apart and gradually brings them closer (gap becomes smaller), while fine-tuning the array. It's performance relies on the choice of gap sequence and is more efficient when sorting medium-sized files.
## Why is it helpful?
	Saves  time. The initial bigger gaps partially sorts the array and by the time it becomes a small gap,
 	there's less shuffling and since everything else is roughly in the right postions already. It's as if doing an insertion sort,
  	but all the heavy lifting has been done earlier in the wider leaps (gaps).
	
## Pseudocode:

		
		
	public static void shellSort(Shape3D[] shapes) {
		int n = shapes.length;
		
		
		//initialize the gap, basically seeting up how far apart we're comparing shapes. initially it's half of the array's length. 	
		for (int gap = n/2; gap > 0; gap /=2) {
		
			//for each gap size, leap through the array. Grab a shape(temp) and then hop back to our gap, comparing volumes as we go.  if the shape is bigger, move forward.
			for (int i = gap; i < n; i +=1) {
				Shape3D temp = shapes[i];
				
				int j;
				
				//inside the loop, it hops back into gaps, moving bigger shapes forward. If the shape(temp) can no longer find bigger volume, hop back) and temp is placed there. Repeat loop.
				for (j = i; j >= gap && shapes[j - gap].getTheVolume() > temp.getTheVolume(); j -= gap) {
					shapes[j] = shapes[j- gap];
				}
				shapes[j] = temp;
			}
		}
	}
		
