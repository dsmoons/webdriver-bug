import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class JunitCustomStrategy implements ParallelExecutionConfiguration, ParallelExecutionConfigurationStrategy {

    @Override
    public int getParallelism() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public int getMinimumRunnable() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public int getMaxPoolSize() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public int getCorePoolSize() {
        return Runtime.getRuntime().availableProcessors();
    }

    @Override
    public int getKeepAliveSeconds() {
        return 30;
    }

    @Override
    public ParallelExecutionConfiguration createConfiguration(final ConfigurationParameters configurationParameters) {
        return this;
    }
}
