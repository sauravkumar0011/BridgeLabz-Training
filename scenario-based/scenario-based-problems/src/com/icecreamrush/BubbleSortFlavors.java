package com.icecreamrush;

import java.util.List;

public class BubbleSortFlavors {
 
	public void sortByPopularity(List<Flavor> flavors)
	{
		int n = flavors.size();
		
		for(int i=0; i < n - i - 1; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(flavors.get(j).getSales()<flavors.get(j+1).getSales()) {
					Flavor temp = flavors.get(j);
					flavors.set(j, flavors.get(j+1));
					flavors.set(j+1, temp);
					
				}
			}
		}
	}
	
}
