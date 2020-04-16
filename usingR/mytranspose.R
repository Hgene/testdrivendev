mytranspose <- function(x) {
  
  if(all(is.na(x))){
    print('ALL value is NA, Check your matrix')
    return(NULL)
  }else if (class(x)=='data.frame'){
    y <-data.frame(matrix(NA,ncol=dim(x)[1], nrow=dim(x)[2]))
    for (i in 1:dim(x)[2]) {
      y[i,]<-x[,i]
    }
    
    return(y)
  }
  
  if (is.vector(x)){
    print('Warning: input vector is considered by column vector')
    x<-matrix(x)
  }
  
  if (sum(is.na(x))!=0){
    print('Warning : Matrix has NA value, NA index is ')
    index <- which(is.na(x))
    #x[is.na(x)] <- TRUE
    print(index)
  }

  y <- matrix(1, nrow=ncol(x), ncol = nrow(x))
  for(i in 1:nrow(x)) {
    for(j in 1:ncol(x)) {
      y[j,i] <- x[i,j]
    }
  }
  return(y)
  
}
