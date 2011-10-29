package com.dstsystems.techforum.hello;

import java.util.logging.Logger;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class Hello implements Tasklet
{

   private static Logger logger = Logger.getLogger( Hello.class.getName() );
   private static final String HELLO_WORLD = "Hello World";

   @Override
   public RepeatStatus execute( StepContribution contribution,
            ChunkContext chunkContext ) throws Exception
   {
      logger.info( HELLO_WORLD );
      System.out.println( HELLO_WORLD );
      return RepeatStatus.FINISHED;
   }

}
