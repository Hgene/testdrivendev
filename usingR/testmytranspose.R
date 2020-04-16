source('./mytranspose.R')
source('./testFunction.R')

#implement test

runAll<-function(){
  print(mytransposeTest_regularMatrix())
  print(mytransposeTest_emptyMatrix())
  print(mytransposeTest_row_vectorMatrix())
  print(mytransposeTest_col_vectorMatrix())
  print(mytransposeTest_vectorinput())
  print(mytransposeTest_NA_vectorinput())
  print(mytransposeTest_empty_vectorinput())
  print(mytransposeTest_NA_dataframe())
}

runAll()



