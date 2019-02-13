pipeline {

    agent any

    tools {
            gradle 'Gradle 5.1.1'
          }


    stages{



         stage ('My build'){
            Serenity_steps {
               sh 'gradle build'
               sh 'gradle clean test'
               sh 'gradle test aggregate'

            }
         }
    }







}