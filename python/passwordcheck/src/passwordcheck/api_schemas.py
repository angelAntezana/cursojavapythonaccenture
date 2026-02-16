from __future__ import annotations
from pydantic import BaseModel, Field

class ValidateIn(BaseModel):
    password: str = Field(min_length = 1, description = "Contraseña a validar")
    mode: str = Field(default = "generador", description = "generador o cache")
    user_id: str | None = Field(default = None, description = "Opcional user id")

class ValidateOut(BaseModel):
    ok: bool
    reason: str
    mode: str
    user_id: str | None = None