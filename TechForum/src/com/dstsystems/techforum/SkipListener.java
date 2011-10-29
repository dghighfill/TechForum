package com.dstsystems.techforum;

import java.util.logging.Logger;

import org.springframework.batch.core.annotation.OnSkipInWrite;

import com.dstsystems.techforum.beans.Customer;

public class SkipListener
{
   private Logger logger = Logger.getLogger( SkipListener.class.getName() );
   
   @OnSkipInWrite
   public void onSkipInWrite( Customer customer, Throwable throwable )
   {
      logger.info( "Customer: " + customer.getId() + " is getting skipped.\n" + throwable.getMessage() );
   }
}
