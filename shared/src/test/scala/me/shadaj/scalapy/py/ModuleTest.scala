package me.shadaj.scalapy.py

import org.scalatest.{FunSuite, BeforeAndAfterAll}

trait StringModuleFacade extends ObjectFacade {
  def digits: String = native
}

class ModuleTest extends FunSuite with BeforeAndAfterAll {
  test("Can read value from module") {
    local {
      assert(module("string").digits.as[String] == "0123456789")
    }
  }

  test("Can convert to facade and call methods") {
    assert(module("string").as[StringModuleFacade].digits == "0123456789")
  }
}