##################################################
#build function

#test
mytransposeTest_regularMatrix<- function(){
  print("mytransposeTest : regularMatrix")
  myvar = matrix(1:10, nrow=5, ncol=2)
  expectedResult = 0
  testResult = sum(t(myvar) != mytranspose(myvar))
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_emptyMatrix<- function(){
  print("mytransposeTest : emptyMatrix")
  myvar = matrix(NA, nrow=0, ncol=0)
  
  expectedResult = NULL
  testResult = mytranspose(myvar)
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_row_vectorMatrix<- function(){
  print("mytransposeTest : row_vectorMatrix")
  myvar <-  matrix(c(1,2), nrow=1, ncol=2)
  
  expectedResult = 0
  testResult = sum(t(myvar) != mytranspose(myvar))
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_col_vectorMatrix<- function(){
  print("mytransposeTest : col_vectorMatrix")
  myvar <-  matrix(c(1,2), nrow=2, ncol=1)
  
  expectedResult = 0
  testResult = sum(t(myvar) != mytranspose(myvar))
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_vectorinput<- function(){
  print("mytransposeTest : vectorinput")
  myvar <-  c(1,2,NA,3)
  
  expectedResult = t(matrix(myvar))
  testResult = mytranspose(myvar)
  Result = sum(expectedResult[!is.na(expectedResult)] != testResult[!is.na(testResult)])
  
  return(all.equal(0, Result))
}


#test
mytransposeTest_NA_vectorinput<- function(){
  print("mytransposeTest : NA_vectorinput")
  myvar <-  c(NA)
  
  expectedResult = 0
  testResult = sum(t(matrix(myvar)) != mytranspose(myvar))
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_empty_vectorinput<- function(){
  print("mytransposeTest : empty_vectorinput")
  myvar <-  c()
  
  expectedResult = 0
  testResult = sum(NULL != mytranspose(myvar))
  
  return(all.equal(expectedResult, testResult))
}


#test
mytransposeTest_NA_dataframe<- function(){
  print("mytransposeTest : NA_dataframe")
  d <- c(1,2,3,4)
  e <- c("red", "white", "red", NA)
  f <- c(TRUE,TRUE,TRUE,FALSE)
  myvar <- data.frame(d,e,f)

  expectedResult = t(myvar)
  testResult = mytranspose(myvar)
  Result = sum(expectedResult[!is.na(expectedResult)] != testResult[!is.na(testResult)])
  
  return(all.equal(0, Result))
}