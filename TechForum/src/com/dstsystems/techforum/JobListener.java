package com.dstsystems.techforum;

import java.util.logging.Logger;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;

public class JobListener
{

   private Logger logger = Logger.getLogger( JobListener.class.getName() );

   @BeforeJob
   public void beforeJob( JobExecution jobExecution )
   {
      logger.info( jobExecution.getJobInstance().getJobName()
               + " is beginning execution" );
   }

   @AfterJob
   public void afterJob( JobExecution jobExecution )
   {
      logger.info( jobExecution.getJobInstance().getJobName()
               + " has completed with status: " + jobExecution.getStatus() );
   }

}
