package com.dstsystems.techforum;

import java.util.logging.Logger;

import org.springframework.batch.core.annotation.OnSkipInProcess;
import org.springframework.batch.core.annotation.OnSkipInRead;
import org.springframework.batch.core.annotation.OnSkipInWrite;

import com.dstsystems.techforum.beans.Customer;

public class SkipListener
{
   private Logger logger = Logger.getLogger( SkipListener.class.getName() );
   
   @OnSkipInRead
   public void onSkipInRead( Throwable throwable )
   {
	   logger.info( "Customer is getting skipped.\n" + throwable.getMessage() );
   }
   @OnSkipInProcess
   public void onSkipInProcess( Customer customer, Throwable throwable ) 
   {
	   logger.info( "Customer: " + customer.getId() + " is getting skipped.\n" + throwable.getMessage() );
   }
   @OnSkipInWrite
   public void onSkipInWrite( Customer customer, Throwable throwable )
   {
      logger.info( "Customer: " + customer.getId() + " is getting skipped.\n" + throwable.getMessage() );
   }
}
