/*
 * Copyright (C) 2012-2014 Soomla Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.soomla.store.billing;

 import java.util.List;

 /**
  * A utility class that defines interfaces for passing callbacks to in-app billing events.
  */
public class IabCallbacks {

     /**
      * Listens for in-app billing service initialization
      */
    public interface IabInitListener {

         /**
          * Performs the following function upon success.
          *
          * @param alreadyInBg true if the listener has already been initialized and is in
          *                    background, false otherwise.
          */
        public void success(boolean alreadyInBg);

         /**
          * Performs the following function upon failure and prints the given message.
          *
          * @param message reason for failure
          */
        public void fail(String message);
    }

     /**
      * Listens for in-app purchases being made
      */
    public interface OnPurchaseListener {

         /**
          * The user has successfully completed a purchase.
          *
          * @param purchase
          */
        public void success(IabPurchase purchase);

         /**
          *
          * @param purchase
          */
        public void cancelled(IabPurchase purchase);

         /**
          *
          * @param purchase
          */
        public void alreadyOwned(IabPurchase purchase);

         /**
          *
          * @param message
          */
        public void fail(String message);
    }

     /**
      * Listens for inventory queries
      */
    public interface OnQueryInventoryListener {

         /**
          *
          * @param purchases
          * @param skuDetails
          */
        public void success(List<IabPurchase> purchases, List<IabSkuDetails> skuDetails);

         /**
          *
          * @param message
          */
        public void fail(String message);
    }


     /**
      * Listens for consumptions of purchases
      */
    public interface OnConsumeListener {
         /**
          *
          * @param purchase
          */
        public void success(IabPurchase purchase);

         /**
          *
          * @param message
          */
        public void fail(String message);
    }

}
