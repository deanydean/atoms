/*
 * Copyright 2016, 2017 Matt Dean
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.oddcyb.atoms.handlers;

import org.oddcyb.atoms.AtomsService;
import org.oddcyb.atoms.store.Store;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 */
public class StoreReplace implements Route
{
    
    private final Store store;
    
    public StoreReplace(Store store)
    {
        this.store = store;
    }

    @Override
    public Object handle(Request req, Response resp) throws Exception 
    {
        String name = req.splat()[0];
        String object = req.body();
        
        return this.store.replace(name, object);
    }
    
}
