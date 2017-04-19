# google-guice-tutorials
4 part tutorial series on Google Guice

"Injecting Single Interface Implementation with Google Guice" Covers dependency injecting a single implementation 
via GoogleGuice. Covers explicit binding in guice module, @Inject, @ImplemtedBy and using both explicit 
binding and @ImplementedBy.  
You can watch the Youtube Video Tutorial to follow along here ...https://youtu.be/wNclLOTxQjk
-----------------------------
Part 1 of Providers  "How to use a Provider with Google Guice" Covers dependency injecting Google Guice Providers.
Covers implicit and explicit binding of Providers as well as annotations: @Provides, @ProvidededBy.

Examples on  programmatically injecting an implementation via a Guice Provider. 
You can watch the Youtube Video Tutorial to follow along here ... https://youtu.be/3uAR5sFgh2A
-----------------------------
Part 2 of Providers "How to use a Provider with Google Guice" Covers injecting dependencies into a Guice Provider, 
Multibindings/Mapbinder and addresses the need to inject run-time date into Providers/Custom Factories.

Examples on programmatically returning a Random implementation via a Guice Provider as well as one decided 
by runtime data entered from the command line.

Best practice advice on how to bootstrap you application from the main method.
You can watch the Youtube Video Tutorial to follow along here ...https://youtu.be/BtGf42WB9wM
-----------------------------
"How to use Assisted Inject with Google Guice" Covers How to use Assisted Inject in Google Guice via a use case 
example in an Air Traffic Control application. Explains the solution space it addresses and advice on when 
to use Assisted Inject.

Outlines the other options that are available before resorting to Assisted Inject as well as Guice's  
annotation @Assisted and the FactoryModuleBuilder with must be configured in your Guice Module
You can watch the Youtube Video Tutorial to follow along here ... https://youtu.be/t6-ctCV8zNM

