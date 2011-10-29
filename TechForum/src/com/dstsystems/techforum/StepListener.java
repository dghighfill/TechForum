package com.dstsystems.techforum;

import java.util.logging.Logger;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.annotation.AfterChunk;
import org.springframework.batch.core.annotation.AfterStep;
import org.springframework.batch.core.annotation.BeforeChunk;
import org.springframework.batch.core.annotation.BeforeStep;

public class StepListener
{
	private int chunkCount = 0;
   private Logger logger = Logger.getLogger( StepListener.class.getName() );
   
   @BeforeStep
   public void beforeStep( StepExecution stepExecution )
   {
      logger.info( stepExecution.getStepName() + " has begun." );
   }
   @AfterStep
   public void afterStep( StepExecution stepExecution )
   {
      logger.info( stepExecution.getStepName() + " has ended." );
   }
   
   @BeforeChunk
   public void beforeChunk()
   {
//      logger.info( "Chunk has begun." );
   }

   @AfterChunk
   public void afterChunk()
   {
      logger.info( "Processed " + (++chunkCount) + " chunks."  );
   }
   
}
