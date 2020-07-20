package example

import com.github.plokhotnyuk.jsoniter_scala.macros._
import com.github.plokhotnyuk.jsoniter_scala.core._

final case class Container(a: Option[Int], b: Option[String], src: Source)

object Container {
  implicit val codec: JsonValueCodec[Container] = JsonCodecMaker.make(CodecMakerConfig.withDiscriminatorFieldName(None))
}
