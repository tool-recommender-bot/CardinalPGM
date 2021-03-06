package in.twizmwaz.cardinal.module.modules.permissions;

import in.twizmwaz.cardinal.GameHandler;
import in.twizmwaz.cardinal.match.Match;
import in.twizmwaz.cardinal.module.LoadTime;
import in.twizmwaz.cardinal.module.ModuleBuilder;
import in.twizmwaz.cardinal.module.ModuleCollection;
import in.twizmwaz.cardinal.module.ModuleLoadTime;

@LoadTime(ModuleLoadTime.EARLIEST)
public class PermissionModuleBuilder implements ModuleBuilder {

    @Override
    public ModuleCollection<PermissionModule> load(Match match) {
        return new ModuleCollection<>(new PermissionModule(GameHandler.getGameHandler().getPlugin()));
    }
}
