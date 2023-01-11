package integration.uninstall

import com.intellij.ide.plugins.IdeaPluginDependency
import com.intellij.ide.plugins.IdeaPluginDescriptor
import com.intellij.openapi.extensions.PluginId
import com.tabnine.general.StaticConfig
import java.io.File
import java.nio.file.Path
import java.util.Date

class PluginDescriptorMock(private val versionMock: String, private val pluginIdMock: PluginId = StaticConfig.TABNINE_PLUGIN_ID) : IdeaPluginDescriptor {
    override fun getPluginId(): PluginId {
        return pluginIdMock
    }

    override fun getPluginClassLoader(): ClassLoader {
        throw RuntimeException("test mock!")
    }

    override fun getPath(): File {
        throw RuntimeException("test mock!")
    }

    override fun getPluginPath(): Path {
        throw RuntimeException("test mock!")
    }

    override fun getDescription(): String? {
        throw RuntimeException("test mock!")
    }

    override fun getChangeNotes(): String {
        throw RuntimeException("test mock!")
    }

    override fun getName(): String {
        throw RuntimeException("test mock!")
    }

    override fun getProductCode(): String? {
        throw RuntimeException("test mock!")
    }

    override fun getReleaseDate(): Date? {
        throw RuntimeException("test mock!")
    }

    override fun getReleaseVersion(): Int {
        throw RuntimeException("test mock!")
    }

    override fun isLicenseOptional(): Boolean {
        throw RuntimeException("test mock!")
    }

    override fun getOptionalDependentPluginIds(): Array<PluginId> {
        throw RuntimeException("test mock!")
    }

    override fun getVendor(): String {
        throw RuntimeException("test mock!")
    }

    override fun getVersion(): String {
        return versionMock
    }

    override fun getResourceBundleBaseName(): String {
        throw RuntimeException("test mock!")
    }

    override fun getCategory(): String {
        throw RuntimeException("test mock!")
    }

    override fun getVendorEmail(): String {
        throw RuntimeException("test mock!")
    }

    override fun getVendorUrl(): String {
        throw RuntimeException("test mock!")
    }

    override fun getUrl(): String {
        throw RuntimeException("test mock!")
    }

    override fun getSinceBuild(): String {
        throw RuntimeException("test mock!")
    }

    override fun getUntilBuild(): String {
        throw RuntimeException("test mock!")
    }

    override fun allowBundledUpdate(): Boolean {
        throw RuntimeException("test mock!")
    }

    override fun isImplementationDetail(): Boolean {
        throw RuntimeException("test mock!")
    }

    override fun isEnabled(): Boolean {
        throw RuntimeException("test mock!")
    }

    override fun setEnabled(enabled: Boolean) {
        throw RuntimeException("test mock!")
    }

    override fun getDependencies(): MutableList<IdeaPluginDependency> {
        TODO("Not yet implemented")
    }

    override fun getDescriptorPath(): String? {
        TODO("Not yet implemented")
    }
}
