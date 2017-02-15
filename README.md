# ZeekyBoogyDoog
Runtime analysis of mergeSort

The runtime of mergesort is O(nlogn). For large values, as n is increased by
  some factor, the time it takes to sort increases by a relatively similar
  factor, albeit slighter higher. This rules out O(n^2) or worst as well as 
  O(n) or better, leaving O(nlogn). Graphing the data suggests that this is
  an accurate analysis.
  
  

As seen in the graph, the data points lie between the curves x^2 and x log x, following closer to the x log x trend.
If all the values are divided by a constant k (found using the time it takes to run a O(1) process)), the data would fit the x log x curve even better.


https://docs.google.com/document/d/11pCO-G3mUEXM3Eix-PwYzmthcTa68t4qbB7JYG6BKvE/pub
