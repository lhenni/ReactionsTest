package mir.reactions.simpleChangesRootTests;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionsChangePropagationSpecification;

@SuppressWarnings("all")
public class SimpleChangesRootTestsChangePropagationSpecification extends AbstractReactionsChangePropagationSpecification {
  public SimpleChangesRootTestsChangePropagationSpecification() {
    super(new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain(), 
    	new tools.vitruv.testutils.domains.AllElementTypesDomainProvider().getDomain());
  }
  
  protected void setup() {
    this.addChangeMainprocessor(new mir.reactions.simpleChangesRootTests.ReactionsExecutor());
  }
}
