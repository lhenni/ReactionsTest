package mir.routines.extended;

import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutinesFacade;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRoutinesFacadesProvider;
import tools.vitruv.extensions.dslsruntime.reactions.RoutinesFacadeExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.ReactionsImportPath;

@SuppressWarnings("all")
public class RoutinesFacadesProvider extends AbstractRoutinesFacadesProvider {
  public AbstractRepairRoutinesFacade createRoutinesFacade(final ReactionsImportPath reactionsImportPath, final RoutinesFacadeExecutionState sharedExecutionState) {
    switch(reactionsImportPath.getPathString()) {
    	case "Extended": {
    		return new mir.routines.extended.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Extended.Base": {
    		return new mir.routines.extended.base.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	case "Extended.Base.CommonFunctions": {
    		return new mir.routines.extended.base.commonFunctions.RoutinesFacade(this, reactionsImportPath, sharedExecutionState);
    	}
    	default: {
    		return null;
    	}
    }
  }
}
