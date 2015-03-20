java_import org.bouncycastle.jce.provider.BouncyCastleProvider

module Example

  def self.bc_info
    BouncyCastleProvider.new.info
  end

end
