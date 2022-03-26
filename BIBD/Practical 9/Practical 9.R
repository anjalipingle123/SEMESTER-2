require("tm")

kshingle<-function(){
  k<- as.integer(readline("Enter a value for k - 1"))
  
  u1<- readLines("BIBD_1.txt")
  
  shingle<-i<-0
  while(i<nchar(u1)-k+1)
  {
    shingle[i]<-substr(u1,i,i+k)
    print(shingle[i])
    
    i<-i+1
  }
}

if(interactive())kshingle()