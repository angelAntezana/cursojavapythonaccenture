from __future__ import annotations
from fastapi import FastAPI, HTTPException

from passwordcheck.util_texto.data.passwords import validar_password
from passwordcheck.api_schemas import ValidateIn, ValidateOut


app = FastAPI(
    title = "passwordcheck",
    version = "0.1.0",
    description = "API REST para validar contraseñas"
)


@app.get("/health")
def health() -> dict:
    return {"status": "ok"}

@app.post("/validate", response_model = ValidateOut)
def validate(payload: ValidateIn) -> ValidateOut:
    if payload.mode not in {"generador", "cache"}:
        raise HTTPException(status_code = 400, detail = "mode tiene que ser un generador o cache")
    ok, reason = validar_password(payload.password, payload.mode)

    return ValidateOut(
        ok = ok,
        reason = reason,
        mode = payload.mode,
        user_id = payload.user_id
    )