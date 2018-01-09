package mir.reactions;

import tools.vitruv.framework.change.processing.impl.CompositeDecomposingChangePropagationSpecification;
import java.util.List;
import java.util.function.Supplier;
import tools.vitruv.framework.testutils.domains.AllElementTypesDomainProvider;
import tools.vitruv.framework.change.processing.ChangePropagationSpecification;
import java.util.Arrays;

/**
 * The {@link class tools.vitruv.framework.change.processing.impl.CompositeDecomposingChangePropagationSpecification} for transformations between the metamodels AllElementTypes and AllElementTypes.
 * To add further change processors override the setup method.
 *
 * <p> This file is generated! Do not edit it but extend it by inheriting from it!
 * 
 * <p> Generated from template version 1
 */
public class AllElementTypesToAllElementTypesChangePropagationSpecification extends CompositeDecomposingChangePropagationSpecification {
	
	private final List<Supplier<? extends ChangePropagationSpecification>> executors = Arrays.asList(
		// begin generated executor list
		mir.reactions.reactionsAllElementTypesToAllElementTypes.sample3.ExecutorAllElementTypesToAllElementTypes::new,
		
		mir.reactions.reactionsAllElementTypesToAllElementTypes.simpleChangesRootTests.ExecutorAllElementTypesToAllElementTypes::new,
		
		mir.reactions.reactionsAllElementTypesToAllElementTypes.sample2.ExecutorAllElementTypesToAllElementTypes::new,
		
		mir.reactions.reactionsAllElementTypesToAllElementTypes.sample.ExecutorAllElementTypesToAllElementTypes::new
		// end generated executor list
	);
	
	public AllElementTypesToAllElementTypesChangePropagationSpecification() {
		super(new AllElementTypesDomainProvider().getDomain(), 
			new AllElementTypesDomainProvider().getDomain());
		setup();
	}
	
	/**
	 * Adds the reactions change processors to this {@link AllElementTypesToAllElementTypesChangePropagationSpecification}.
	 * For adding further change processors overwrite this method and call the super method at the right place.
	 */
	protected void setup() {
		for (final Supplier<? extends ChangePropagationSpecification> executorSupplier : executors) {
			this.addChangeMainprocessor(executorSupplier.get());
		}	
	}
}