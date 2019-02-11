pipeline {

    agent any

    tools {
            gradle 'Gradle 5.1.1'
          }


    stages{



         stage ('My build'){
            steps {
               sh 'gradle build'
               sh 'gradle test aggregate'
            }
         }
    }







}