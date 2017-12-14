package cofh.cofhworld.feature;

import cofh.cofhworld.util.WeightedRandomBlock;
import com.typesafe.config.Config;
import org.apache.logging.log4j.Logger;

import java.util.List;

public interface IGeneratorParser {

	/**
	 * Parse a {@link Config} for usage with an {@link IDistribution}.
	 *
	 * @param name      The name of the generator entry.
	 * @param genObject The JsonObject to parse.
	 * @param log       The {@link Logger} to log debug/error/etc. messages to.
	 * @param resList   The processed list of resources to generate
	 * @param matList   The processed list of materials to generate in
	 * @return The {@link IGenerator}
	 */
	IGenerator parseGenerator(String name, Config genObject, Logger log, List<WeightedRandomBlock> resList, List<WeightedRandomBlock> matList);
}