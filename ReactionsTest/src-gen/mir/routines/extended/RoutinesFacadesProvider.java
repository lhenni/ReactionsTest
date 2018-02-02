package mir.routines.extended;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "extended": {
    		return new mir.routines.extended.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "extended.base": {
    		return new mir.routines.extended.base.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "extended.base.commonFunctions": {
    		return new mir.routines.extended.base.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    		return null;
    	}
    }
  }
}
