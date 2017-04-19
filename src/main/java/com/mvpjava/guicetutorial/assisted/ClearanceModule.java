
package com.mvpjava.guicetutorial.assisted;

import com.google.inject.assistedinject.FactoryModuleBuilder;

public class ClearanceModule extends com.google.inject.AbstractModule{

    @Override
    protected void configure() {
        install(new FactoryModuleBuilder()
                .implement(Clearable.class,ClearanceProber.class)
                .build(ClearanceProber.ClearaceProberFactory.class));
    }
}
