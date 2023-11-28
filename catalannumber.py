def fact(n):#recursive function to calculate factorial of 'n'
    if(n==0):
          return 1
    else:
          return(n*fact(n-1))
      
ctr=int(input("\n Enter the count of catalan numbers to be generated:"))#stores the count of numbers to be generated    
print("\n The first {} Catalan Numbers are...\n".format(ctr))
for i in range(0,ctr):
  term1=fact(2*i)  #stores the value of  (2n)!
  term2=fact(i+1)#stores the value of (n+1)!
  term3=fact(i)#stores the value of n!
  finalterm=int(term1/(term2*term3))#gives final term=catalan number at i'th position
  print(finalterm,end=" ")