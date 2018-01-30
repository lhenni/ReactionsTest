package mir.routines.base2;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "Base2": {
    		return new mir.routines.base2.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Base2.CommonFunctions": {
    		return new mir.routines.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    		return null;
    	}
    }
  }
}
