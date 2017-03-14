package factory

import bc.{ByteCodeFactory, ByteCodeParser, ByteCodeParserImpl}
import vendor.ProgramParser
import vm.{VirtualMachine, VirtualMachineParser}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  /**
    * Get a default implementation of ByteCodeFactory.
    */
  val byteCodeFactory: ByteCodeFactory = bc.ByteCodeFactoryImpl

  // TODO
  def vendorParser: ProgramParser = ???

  /**
    * Get a default implementation of ByteCodeParser.
    *
    * (Implemented as a lazy val so that we only create one ByteCodeParser instance, and delay
    * creation until, or if, it is required.)
    */
  lazy val byteCodeParser: ByteCodeParser = new ByteCodeParserImpl(byteCodeFactory)

  // TODO
  def virtualMachineParser: VirtualMachineParser = ???

  // TODO
  def virtualMachine: VirtualMachine = ???
}
